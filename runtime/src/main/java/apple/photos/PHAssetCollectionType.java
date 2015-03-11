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
@Mapping("PHAssetCollectionType")
public final class PHAssetCollectionType extends ObjCEnum {
    
    @GlobalConstant("PHAssetCollectionTypeAlbum")
    public static final long Album = 1L;
    @GlobalConstant("PHAssetCollectionTypeSmartAlbum")
    public static final long SmartAlbum = 2L;
    @GlobalConstant("PHAssetCollectionTypeMoment")
    public static final long Moment = 3L;
    

}
