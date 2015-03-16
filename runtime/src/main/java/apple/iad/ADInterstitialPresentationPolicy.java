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
 * @since Available in iOS 7.0 and later.
 */

@Library("iAd/iAd.h")
@Mapping("ADInterstitialPresentationPolicy")
public final class ADInterstitialPresentationPolicy extends ObjCEnum {
    
    @GlobalConstant("ADInterstitialPresentationPolicyNone")
    public static final long None = 0L;
    @GlobalConstant("ADInterstitialPresentationPolicyAutomatic")
    public static final long Automatic = 1L;
    @GlobalConstant("ADInterstitialPresentationPolicyManual")
    public static final long Manual = 2L;
    

}
