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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("iAd/iAd.h") @Mapping("ADBannerView")
public class ADBannerView 
    extends UIView 
     {

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("initWithAdType:")
    public ADBannerView(@Representing("ADAdType") @MachineSizedSInt long type) { }
    @Mapping("initWithFrame:")
    public ADBannerView(CGRect frame) { }
    @Mapping("init")
    public ADBannerView() { }
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("adType")
    public native @Representing("ADAdType") @MachineSizedSInt long getAdType();
    @Mapping("delegate")
    public native ADBannerViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(ADBannerViewDelegate v);
    @Mapping("isBannerLoaded")
    public native boolean isBannerLoaded();
    @Mapping("isBannerViewActionInProgress")
    public native boolean isBannerViewActionInProgress();
    @Mapping("advertisingSection")
    public native String getAdvertisingSection();
    @Mapping("setAdvertisingSection:")
    public native void setAdvertisingSection(String v);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("requiredContentSizeIdentifiers")
    public native List<ADBannerContentSizeIdentifier> getRequiredContentSizeIdentifiers();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setRequiredContentSizeIdentifiers:")
    public native void setRequiredContentSizeIdentifiers(List<ADBannerContentSizeIdentifier> v);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("currentContentSizeIdentifier")
    public native ADBannerContentSizeIdentifier getCurrentContentSizeIdentifier();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setCurrentContentSizeIdentifier:")
    public native void setCurrentContentSizeIdentifier(ADBannerContentSizeIdentifier v);
    
    
    
    @Mapping("cancelBannerViewAction")
    public native void cancelBannerViewAction();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("sizeFromBannerContentSizeIdentifier:")
    public static native CGSize getSizeForIdentifier(String contentSizeIdentifier);
    
}
