package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("PHVideoRequestOptionsDeliveryMode")
public final class PHVideoRequestOptionsDeliveryMode extends ObjCEnum {
    
    @GlobalConstant("PHVideoRequestOptionsDeliveryModeAutomatic")
    public static final long Automatic = 0L;
    @GlobalConstant("PHVideoRequestOptionsDeliveryModeHighQualityFormat")
    public static final long HighQualityFormat = 1L;
    @GlobalConstant("PHVideoRequestOptionsDeliveryModeMediumQualityFormat")
    public static final long MediumQualityFormat = 2L;
    @GlobalConstant("PHVideoRequestOptionsDeliveryModeFastFormat")
    public static final long FastFormat = 3L;
    

}
