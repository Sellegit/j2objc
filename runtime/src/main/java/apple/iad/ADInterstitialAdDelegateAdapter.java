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
@Adapter
public abstract class ADInterstitialAdDelegateAdapter 
    extends Object 
    implements ADInterstitialAdDelegate {

    
    
    


    
    
    @NotImplemented("interstitialAdDidUnload:")
    public void didUnload(ADInterstitialAd interstitialAd) { throw new UnsupportedOperationException(); }
    @NotImplemented("interstitialAd:didFailWithError:")
    public void didFail(ADInterstitialAd interstitialAd, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("interstitialAdWillLoad:")
    public void willLoad(ADInterstitialAd interstitialAd) { throw new UnsupportedOperationException(); }
    @NotImplemented("interstitialAdDidLoad:")
    public void didLoad(ADInterstitialAd interstitialAd) { throw new UnsupportedOperationException(); }
    @NotImplemented("interstitialAdActionShouldBegin:willLeaveApplication:")
    public boolean actionShouldBegin(ADInterstitialAd interstitialAd, boolean willLeave) { throw new UnsupportedOperationException(); }
    @NotImplemented("interstitialAdActionDidFinish:")
    public void actionDidFinish(ADInterstitialAd interstitialAd) { throw new UnsupportedOperationException(); }

}
