package com.mc.network.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class NetworkModule_ProvideOkhttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideOkhttpClient();
  }

  public static NetworkModule_ProvideOkhttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideOkhttpClient() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkhttpClient());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideOkhttpClientFactory INSTANCE = new NetworkModule_ProvideOkhttpClientFactory();
  }
}
