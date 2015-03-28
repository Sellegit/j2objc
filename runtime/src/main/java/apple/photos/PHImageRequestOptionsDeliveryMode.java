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
@Library("Photos/Photos.h")
@Mapping("PHImageRequestOptionsDeliveryMode")
public final class PHImageRequestOptionsDeliveryMode extends ObjCEnum {
    
    @GlobalConstant("PHImageRequestOptionsDeliveryModeOpportunistic")
    public static final long Opportunistic = 0L;
    @GlobalConstant("PHImageRequestOptionsDeliveryModeHighQualityFormat")
    public static final long HighQualityFormat = 1L;
    @GlobalConstant("PHImageRequestOptionsDeliveryModeFastFormat")
    public static final long FastFormat = 2L;


}
