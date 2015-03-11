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

@Library("Photos")
@Mapping("PHAssetMediaSubtype")
public final class PHAssetMediaSubtype extends ObjCEnum {
    
    @GlobalConstant("PHAssetMediaSubtypeNone")
    public static final long None = 0L;
    @GlobalConstant("PHAssetMediaSubtypePhotoPanorama")
    public static final long PhotoPanorama = 1L;
    @GlobalConstant("PHAssetMediaSubtypePhotoHDR")
    public static final long PhotoHDR = 2L;
    @GlobalConstant("PHAssetMediaSubtypeVideoStreamed")
    public static final long VideoStreamed = 65536L;
    @GlobalConstant("PHAssetMediaSubtypeVideoHighFrameRate")
    public static final long VideoHighFrameRate = 131072L;
    @GlobalConstant("PHAssetMediaSubtypeVideoTimelapse")
    public static final long VideoTimelapse = 262144L;
    

}
