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
 * @since Available in iOS 4.3 and later.
 */

@Library("iAd/iAd.h") @Mapping("ADInterstitialAd")
public final class ADInterstitialAd 
    extends NSObject 
     {

    
    
    public ADInterstitialAd() {}
    
    
    @Mapping("delegate")
    public native ADInterstitialAdDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(ADInterstitialAdDelegate v);
    @Mapping("isLoaded")
    public native boolean isLoaded();
    @Mapping("isActionInProgress")
    public native boolean isActionInProgress();
    
    
    
    @Mapping("cancelAction")
    public native void cancelAction();
    @Mapping("presentInView:")
    public native boolean present(UIView containerView);
    
}
