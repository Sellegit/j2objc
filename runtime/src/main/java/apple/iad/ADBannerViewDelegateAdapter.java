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

public abstract class ADBannerViewDelegateAdapter 
    extends Object 
    implements ADBannerViewDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("bannerViewWillLoadAd:")
    public void willLoadAd(ADBannerView banner) { throw new UnsupportedOperationException(); }
    @NotImplemented("bannerViewDidLoadAd:")
    public void didLoadAd(ADBannerView banner) { throw new UnsupportedOperationException(); }
    @NotImplemented("bannerView:didFailToReceiveAdWithError:")
    public void didFailToReceiveAd(ADBannerView banner, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("bannerViewActionShouldBegin:willLeaveApplication:")
    public boolean actionShouldBegin(ADBannerView banner, boolean willLeave) { throw new UnsupportedOperationException(); }
    @NotImplemented("bannerViewActionDidFinish:")
    public void actionDidFinish(ADBannerView banner) { throw new UnsupportedOperationException(); }
    
}
