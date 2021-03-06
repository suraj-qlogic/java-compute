/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RegionTargetHttpProxyClient.ListRegionTargetHttpProxiesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.RegionTargetHttpProxyStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionTargetHttpProxyClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://compute.googleapis.com/compute/v1/projects/) and
 *       default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of deleteRegionTargetHttpProxy to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionTargetHttpProxySettings.Builder regionTargetHttpProxySettingsBuilder =
 *     RegionTargetHttpProxySettings.newBuilder();
 * regionTargetHttpProxySettingsBuilder
 *     .deleteRegionTargetHttpProxySettings()
 *     .setRetrySettings(
 *         regionTargetHttpProxySettingsBuilder.deleteRegionTargetHttpProxySettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RegionTargetHttpProxySettings regionTargetHttpProxySettings = regionTargetHttpProxySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionTargetHttpProxySettings extends ClientSettings<RegionTargetHttpProxySettings> {
  /** Returns the object with the settings used for calls to deleteRegionTargetHttpProxy. */
  public UnaryCallSettings<DeleteRegionTargetHttpProxyHttpRequest, Operation>
      deleteRegionTargetHttpProxySettings() {
    return ((RegionTargetHttpProxyStubSettings) getStubSettings())
        .deleteRegionTargetHttpProxySettings();
  }

  /** Returns the object with the settings used for calls to getRegionTargetHttpProxy. */
  public UnaryCallSettings<GetRegionTargetHttpProxyHttpRequest, TargetHttpProxy>
      getRegionTargetHttpProxySettings() {
    return ((RegionTargetHttpProxyStubSettings) getStubSettings())
        .getRegionTargetHttpProxySettings();
  }

  /** Returns the object with the settings used for calls to insertRegionTargetHttpProxy. */
  public UnaryCallSettings<InsertRegionTargetHttpProxyHttpRequest, Operation>
      insertRegionTargetHttpProxySettings() {
    return ((RegionTargetHttpProxyStubSettings) getStubSettings())
        .insertRegionTargetHttpProxySettings();
  }

  /** Returns the object with the settings used for calls to listRegionTargetHttpProxies. */
  public PagedCallSettings<
          ListRegionTargetHttpProxiesHttpRequest,
          TargetHttpProxyList,
          ListRegionTargetHttpProxiesPagedResponse>
      listRegionTargetHttpProxiesSettings() {
    return ((RegionTargetHttpProxyStubSettings) getStubSettings())
        .listRegionTargetHttpProxiesSettings();
  }

  /** Returns the object with the settings used for calls to setUrlMapRegionTargetHttpProxy. */
  public UnaryCallSettings<SetUrlMapRegionTargetHttpProxyHttpRequest, Operation>
      setUrlMapRegionTargetHttpProxySettings() {
    return ((RegionTargetHttpProxyStubSettings) getStubSettings())
        .setUrlMapRegionTargetHttpProxySettings();
  }

  public static final RegionTargetHttpProxySettings create(RegionTargetHttpProxyStubSettings stub)
      throws IOException {
    return new RegionTargetHttpProxySettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RegionTargetHttpProxyStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return RegionTargetHttpProxyStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return RegionTargetHttpProxyStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return RegionTargetHttpProxyStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RegionTargetHttpProxyStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return RegionTargetHttpProxyStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RegionTargetHttpProxyStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RegionTargetHttpProxyStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RegionTargetHttpProxySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for RegionTargetHttpProxySettings. */
  public static class Builder
      extends ClientSettings.Builder<RegionTargetHttpProxySettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(RegionTargetHttpProxyStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(RegionTargetHttpProxyStubSettings.newBuilder());
    }

    protected Builder(RegionTargetHttpProxySettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RegionTargetHttpProxyStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public RegionTargetHttpProxyStubSettings.Builder getStubSettingsBuilder() {
      return ((RegionTargetHttpProxyStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to deleteRegionTargetHttpProxy. */
    public UnaryCallSettings.Builder<DeleteRegionTargetHttpProxyHttpRequest, Operation>
        deleteRegionTargetHttpProxySettings() {
      return getStubSettingsBuilder().deleteRegionTargetHttpProxySettings();
    }

    /** Returns the builder for the settings used for calls to getRegionTargetHttpProxy. */
    public UnaryCallSettings.Builder<GetRegionTargetHttpProxyHttpRequest, TargetHttpProxy>
        getRegionTargetHttpProxySettings() {
      return getStubSettingsBuilder().getRegionTargetHttpProxySettings();
    }

    /** Returns the builder for the settings used for calls to insertRegionTargetHttpProxy. */
    public UnaryCallSettings.Builder<InsertRegionTargetHttpProxyHttpRequest, Operation>
        insertRegionTargetHttpProxySettings() {
      return getStubSettingsBuilder().insertRegionTargetHttpProxySettings();
    }

    /** Returns the builder for the settings used for calls to listRegionTargetHttpProxies. */
    public PagedCallSettings.Builder<
            ListRegionTargetHttpProxiesHttpRequest,
            TargetHttpProxyList,
            ListRegionTargetHttpProxiesPagedResponse>
        listRegionTargetHttpProxiesSettings() {
      return getStubSettingsBuilder().listRegionTargetHttpProxiesSettings();
    }

    /** Returns the builder for the settings used for calls to setUrlMapRegionTargetHttpProxy. */
    public UnaryCallSettings.Builder<SetUrlMapRegionTargetHttpProxyHttpRequest, Operation>
        setUrlMapRegionTargetHttpProxySettings() {
      return getStubSettingsBuilder().setUrlMapRegionTargetHttpProxySettings();
    }

    @Override
    public RegionTargetHttpProxySettings build() throws IOException {
      return new RegionTargetHttpProxySettings(this);
    }
  }
}
