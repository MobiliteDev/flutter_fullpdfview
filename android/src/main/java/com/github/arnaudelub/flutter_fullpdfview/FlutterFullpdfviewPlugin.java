package com.github.arnaudelub.flutter_fullpdfview;



import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;




public class FlutterFullpdfviewPlugin implements FlutterPlugin {
    /// The MethodChannel that will the communication between Flutter and native
    /// Android
    ///
    /// This local reference serves to register the plugin with the Flutter Engine
    /// and unregister it
    /// when the Flutter Engine is detached from the Activity
    //private MethodChannel channel;

    @Override
    public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {

        // channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(),
        // "flutter_qrcode_scanner");
        // channel.setMethodCallHandler(this);
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugins.arnaudelub.io/pdfview",
                new FULLPDFViewFactory(flutterPluginBinding.getBinaryMessenger()));
    }

    @Override
    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
        //channel.setMethodCallHandler(null);
    }

    /** Plugin registration. */
    /**
     * public static void registerWith(Registrar registrar) {
     * registrar.platformViewRegistry().registerViewFactory("plugins.arnaudelub.io/pdfview",
     * new FULLPDFViewFactory(registrar.messenger())); }
     **/
}
