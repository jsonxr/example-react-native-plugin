package com.example;

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider

class ExamplePackage : TurboReactPackage() {
  override fun getModule(name: String?, reactContext: ReactApplicationContext): NativeModule? =
  if (name == ExampleModule.NAME) {
    ExampleModule(reactContext)
  } else {
    null
  }

  override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
    mapOf(
      ExampleModule.NAME to ReactModuleInfo(
        ExampleModule.NAME,
        ExampleModule.NAME,
        false, // canOverrideExistingModule
        false, // needsEagerInit
        true, // hasConstants
        false, // isCxxModule
        true // isTurboModule
      )
    )
  }

}