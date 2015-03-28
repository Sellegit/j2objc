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


@Library("iAd/iAd.h") @Mapping("ADInterstitialAdDelegate")
public interface ADInterstitialAdDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("interstitialAdDidUnload:")
    void didUnload(ADInterstitialAd interstitialAd);
    @Mapping("interstitialAd:didFailWithError:")
    void didFail(ADInterstitialAd interstitialAd, NSError error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("interstitialAdWillLoad:")
    void willLoad(ADInterstitialAd interstitialAd);
    @Mapping("interstitialAdDidLoad:")
    void didLoad(ADInterstitialAd interstitialAd);
    @Mapping("interstitialAdActionShouldBegin:willLeaveApplication:")
    boolean actionShouldBegin(ADInterstitialAd interstitialAd, boolean willLeave);
    @Mapping("interstitialAdActionDidFinish:")
    void actionDidFinish(ADInterstitialAd interstitialAd);

    /*<adapter>*/
    /*</adapter>*/
}
