package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;






@Mapping("NSURLRequestNetworkServiceType")
public final class NSURLRequestNetworkServiceType extends ObjCEnum {
    
    @GlobalConstant("NSURLNetworkServiceTypeDefault")
    public static final long Default = 0L;
    @GlobalConstant("NSURLNetworkServiceTypeVoIP")
    public static final long VoIP = 1L;
    @GlobalConstant("NSURLNetworkServiceTypeVideo")
    public static final long Video = 2L;
    @GlobalConstant("NSURLNetworkServiceTypeBackground")
    public static final long Background = 3L;
    @GlobalConstant("NSURLNetworkServiceTypeVoice")
    public static final long Voice = 4L;
    

}
