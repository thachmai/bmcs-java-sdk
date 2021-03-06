/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.oracle.bmc.ConfigFileReader.ConfigFile;

public class ConfigFileReaderTest {

    @Test(expected = FileNotFoundException.class)
    public void noConfigFile() throws IOException {
        ConfigFileReader.parse("src/test/resources/does_not_exist");
    }

    @Test(expected = IllegalStateException.class)
    public void noDefaultProfile() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_no_default_config");
    }

    @Test(expected = IllegalStateException.class)
    public void noLeadingProfile() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_no_leading_profile_config");
    }

    @Test(expected = IllegalStateException.class)
    public void lineWithNoValue() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_no_value_config");
    }

    @Test(expected = IllegalStateException.class)
    public void lineWithEmptyKey() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_empty_key_config");
    }

    @Test(expected = IllegalArgumentException.class)
    public void noProfile() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_config", "foobar");
    }

    @Test(expected = IllegalStateException.class)
    public void emptyProfileName() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_empty_profile_name_config");
    }

    @Test
    public void defaultProfile() throws IOException {
        ConfigFile configFile = ConfigFileReader.parse("src/test/resources/unit_test_config");
        assertEquals("value", configFile.get("key"));
        assertEquals("value2", configFile.get("key2"));
        assertEquals("value3", configFile.get("key3"));
        assertEquals("value4", configFile.get("key4"));
        assertEquals("=val=ue=", configFile.get("key5"));
        assertEquals("value6", configFile.get("[key6"));
    }

    @Test
    public void overrideProfile() throws IOException {
        ConfigFile profile1 =
                ConfigFileReader.parse("src/test/resources/unit_test_config", "PROFILE1");
        assertEquals("new value", profile1.get("key"));
        assertEquals("value2", profile1.get("key2"));

        ConfigFile profile2 =
                ConfigFileReader.parse("src/test/resources/unit_test_config", "PROFILE2");
        assertEquals("value=foobar", profile2.get("key"));
        assertEquals("nota#comment", profile2.get("key2"));
    }
}
