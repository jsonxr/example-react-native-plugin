package com.example

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.example.NativeExampleSpec

class ExampleModule(reactContext: ReactApplicationContext) : NativeExampleSpec(reactContext) {

  override fun getName() = NAME

  override fun add(a: Double, b: Double, promise: Promise) {
    promise.resolve(a + b)
  }

  companion object {
    const val NAME = "RTNExample"
  }
}