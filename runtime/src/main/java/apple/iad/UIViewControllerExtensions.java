package apple.iad;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;
import apple.addressbook.*;
import apple.mediaplayer.*;
import apple.avkit.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("iAd/iAd.h")
public final class UIViewControllerExtensions 
    extends NSExtensions 
     {

    
    
    private UIViewControllerExtensions() {}

    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("interstitialPresentationPolicy")
    public static native @Representing("ADInterstitialPresentationPolicy") long getInterstitialPresentationPolicy(UIViewController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("setInterstitialPresentationPolicy:")
    public static native void setInterstitialPresentationPolicy(UIViewController thiz, @Representing("ADInterstitialPresentationPolicy") long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("canDisplayBannerAds")
    public static native boolean canDisplayBannerAds(UIViewController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("setCanDisplayBannerAds:")
    public static native void setCanDisplayBannerAds(UIViewController thiz, boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("originalContentView")
    public static native UIView getOriginalContentView(UIViewController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("isPresentingFullScreenAd")
    public static native boolean isPresentingFullScreenAd(UIViewController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("isDisplayingBannerAd")
    public static native boolean isDisplayingBannerAd(UIViewController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("shouldPresentInterstitialAd")
    public static native boolean shouldPresentInterstitialAd(UIViewController thiz);

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("requestInterstitialAdPresentation")
    public static native boolean requestInterstitialAdPresentation(UIViewController thiz);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

}
