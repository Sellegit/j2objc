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


@Library("iAd/iAd.h") @Mapping("ADBannerViewDelegate")
public interface ADBannerViewDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("bannerViewWillLoadAd:")
    void willLoadAd(ADBannerView banner);
    @Mapping("bannerViewDidLoadAd:")
    void didLoadAd(ADBannerView banner);
    @Mapping("bannerView:didFailToReceiveAdWithError:")
    void didFailToReceiveAd(ADBannerView banner, NSError error);
    @Mapping("bannerViewActionShouldBegin:willLeaveApplication:")
    boolean actionShouldBegin(ADBannerView banner, boolean willLeave);
    @Mapping("bannerViewActionDidFinish:")
    void actionDidFinish(ADBannerView banner);

    /*<adapter>*/
    /*</adapter>*/
}
