/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ComputeAsyncClient implements ComputeAsync {
    /**
     * Service instance for Compute.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("COMPUTE", "iaas");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ComputeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public ComputeAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public ComputeAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase();
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<AttachVnicResponse> attachVnic(
            AttachVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse> handler) {
        LOG.trace("Called async attachVnic");
        request = AttachVnicConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = AttachVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachVnicResponse> transformer =
                AttachVnicConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getAttachVnicDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResponse> attachVolume(
            AttachVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                    handler) {
        LOG.trace("Called async attachVolume");
        request = AttachVolumeConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                AttachVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachVolumeResponse>
                transformer = AttachVolumeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getAttachVolumeDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CaptureConsoleHistoryResponse> captureConsoleHistory(
            CaptureConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async captureConsoleHistory");
        request = CaptureConsoleHistoryConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CaptureConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CaptureConsoleHistoryResponse>
                transformer = CaptureConsoleHistoryConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib, request.getCaptureConsoleHistoryDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateImageResponse> createImage(
            CreateImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse>
                    handler) {
        LOG.trace("Called async createImage");
        request = CreateImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                CreateImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateImageResponse>
                transformer = CreateImageConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateImageDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async deleteConsoleHistory");
        request = DeleteConsoleHistoryConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteConsoleHistoryResponse>
                transformer = DeleteConsoleHistoryConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResponse> deleteImage(
            DeleteImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse>
                    handler) {
        LOG.trace("Called async deleteImage");
        request = DeleteImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DeleteImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteImageResponse>
                transformer = DeleteImageConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DetachVnicResponse> detachVnic(
            DetachVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse> handler) {
        LOG.trace("Called async detachVnic");
        request = DetachVnicConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = DetachVnicConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachVnicResponse> transformer =
                DetachVnicConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResponse> detachVolume(
            DetachVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                    handler) {
        LOG.trace("Called async detachVolume");
        request = DetachVolumeConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                DetachVolumeConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachVolumeResponse>
                transformer = DetachVolumeConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ExportImageResponse> exportImage(
            ExportImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse>
                    handler) {
        LOG.trace("Called async exportImage");
        request = ExportImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ExportImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ExportImageResponse>
                transformer = ExportImageConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getExportImageDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistory");
        request = GetConsoleHistoryConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetConsoleHistoryConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryResponse>
                transformer = GetConsoleHistoryConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                    handler) {
        LOG.trace("Called async getConsoleHistoryContent");
        request = GetConsoleHistoryContentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetConsoleHistoryContentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConsoleHistoryContentResponse>
                transformer = GetConsoleHistoryContentConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetImageResponse> getImage(
            GetImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse> handler) {
        LOG.trace("Called async getImage");
        request = GetImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = GetImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetImageResponse> transformer =
                GetImageConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResponse> getInstance(
            GetInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse>
                    handler) {
        LOG.trace("Called async getInstance");
        request = GetInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetInstanceResponse>
                transformer = GetInstanceConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetVnicAttachmentResponse> getVnicAttachment(
            GetVnicAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                    handler) {
        LOG.trace("Called async getVnicAttachment");
        request = GetVnicAttachmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetVnicAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVnicAttachmentResponse>
                transformer = GetVnicAttachmentConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetVolumeAttachmentResponse> getVolumeAttachment(
            GetVolumeAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                    handler) {
        LOG.trace("Called async getVolumeAttachment");
        request = GetVolumeAttachmentConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetVolumeAttachmentConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetVolumeAttachmentResponse>
                transformer = GetVolumeAttachmentConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>
            getWindowsInstanceInitialCredentials(
                    GetWindowsInstanceInitialCredentialsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetWindowsInstanceInitialCredentialsRequest,
                                    GetWindowsInstanceInitialCredentialsResponse>
                            handler) {
        LOG.trace("Called async getWindowsInstanceInitialCredentials");
        request = GetWindowsInstanceInitialCredentialsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                GetWindowsInstanceInitialCredentialsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWindowsInstanceInitialCredentialsResponse>
                transformer = GetWindowsInstanceInitialCredentialsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<InstanceActionResponse> instanceAction(
            InstanceActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<InstanceActionRequest, InstanceActionResponse>
                    handler) {
        LOG.trace("Called async instanceAction");
        request = InstanceActionConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                InstanceActionConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, InstanceActionResponse>
                transformer = InstanceActionConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<LaunchInstanceResponse> launchInstance(
            LaunchInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<LaunchInstanceRequest, LaunchInstanceResponse>
                    handler) {
        LOG.trace("Called async launchInstance");
        request = LaunchInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                LaunchInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, LaunchInstanceResponse>
                transformer = LaunchInstanceConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getLaunchInstanceDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                    handler) {
        LOG.trace("Called async listConsoleHistories");
        request = ListConsoleHistoriesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListConsoleHistoriesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListConsoleHistoriesResponse>
                transformer = ListConsoleHistoriesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListImagesResponse> listImages(
            ListImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse> handler) {
        LOG.trace("Called async listImages");
        request = ListImagesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListImagesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListImagesResponse> transformer =
                ListImagesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResponse> listInstances(
            ListInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                    handler) {
        LOG.trace("Called async listInstances");
        request = ListInstancesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListInstancesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListInstancesResponse>
                transformer = ListInstancesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handler) {
        LOG.trace("Called async listShapes");
        request = ListShapesConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib = ListShapesConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListShapesResponse> transformer =
                ListShapesConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListVnicAttachmentsResponse> listVnicAttachments(
            ListVnicAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listVnicAttachments");
        request = ListVnicAttachmentsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListVnicAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVnicAttachmentsResponse>
                transformer = ListVnicAttachmentsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListVolumeAttachmentsResponse> listVolumeAttachments(
            ListVolumeAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                    handler) {
        LOG.trace("Called async listVolumeAttachments");
        request = ListVolumeAttachmentsConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                ListVolumeAttachmentsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListVolumeAttachmentsResponse>
                transformer = ListVolumeAttachmentsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<TerminateInstanceResponse> terminateInstance(
            TerminateInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstanceRequest, TerminateInstanceResponse>
                    handler) {
        LOG.trace("Called async terminateInstance");
        request = TerminateInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                TerminateInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, TerminateInstanceResponse>
                transformer = TerminateInstanceConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateImageResponse> updateImage(
            UpdateImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse>
                    handler) {
        LOG.trace("Called async updateImage");
        request = UpdateImageConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateImageConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateImageResponse>
                transformer = UpdateImageConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateImageDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceResponse> updateInstance(
            UpdateInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResponse>
                    handler) {
        LOG.trace("Called async updateInstance");
        request = UpdateInstanceConverter.interceptRequest(request);
        javax.ws.rs.client.Invocation.Builder ib =
                UpdateInstanceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInstanceResponse>
                transformer = UpdateInstanceConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUpdateInstanceDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }
}
