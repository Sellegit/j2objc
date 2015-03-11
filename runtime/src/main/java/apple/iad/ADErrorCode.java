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

@Library("iAd")
@Mapping("ADErrorCode")
public final class ADErrorCode extends ObjCEnum {
    
    @GlobalConstant("ADErrorUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("ADErrorServerFailure")
    public static final long ServerFailure = 1L;
    @GlobalConstant("ADErrorLoadingThrottled")
    public static final long LoadingThrottled = 2L;
    @GlobalConstant("ADErrorInventoryUnavailable")
    public static final long InventoryUnavailable = 3L;
    @GlobalConstant("ADErrorConfigurationError")
    public static final long ConfigurationError = 4L;
    @GlobalConstant("ADErrorBannerVisibleWithoutContent")
    public static final long BannerVisibleWithoutContent = 5L;
    @GlobalConstant("ADErrorApplicationInactive")
    public static final long ApplicationInactive = 6L;
    @GlobalConstant("ADErrorAdUnloaded")
    public static final long AdUnloaded = 7L;
    

}
