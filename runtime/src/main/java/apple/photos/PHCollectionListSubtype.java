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
@Mapping("PHCollectionListSubtype")
public final class PHCollectionListSubtype extends ObjCEnum {
    
    @GlobalConstant("PHCollectionListSubtypeMomentListCluster")
    public static final long MomentListCluster = 1L;
    @GlobalConstant("PHCollectionListSubtypeMomentListYear")
    public static final long MomentListYear = 2L;
    @GlobalConstant("PHCollectionListSubtypeRegularFolder")
    public static final long RegularFolder = 100L;
    @GlobalConstant("PHCollectionListSubtypeSmartFolderEvents")
    public static final long SmartFolderEvents = 200L;
    @GlobalConstant("PHCollectionListSubtypeSmartFolderFaces")
    public static final long SmartFolderFaces = 201L;
    @GlobalConstant("PHCollectionListSubtypeAny")
    public static final long Any = 2147483647L;


}
