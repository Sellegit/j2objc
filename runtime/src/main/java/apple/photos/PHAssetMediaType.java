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
@Mapping("PHAssetMediaType")
public final class PHAssetMediaType extends ObjCEnum {
    
    @GlobalConstant("PHAssetMediaTypeUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("PHAssetMediaTypeImage")
    public static final long Image = 1L;
    @GlobalConstant("PHAssetMediaTypeVideo")
    public static final long Video = 2L;
    @GlobalConstant("PHAssetMediaTypeAudio")
    public static final long Audio = 3L;
    

}
