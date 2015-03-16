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
@Mapping("PHAssetCollectionSubtype")
public final class PHAssetCollectionSubtype extends ObjCEnum {
    
    @GlobalConstant("PHAssetCollectionSubtypeAlbumRegular")
    public static final long AlbumRegular = 2L;
    @GlobalConstant("PHAssetCollectionSubtypeAlbumSyncedEvent")
    public static final long AlbumSyncedEvent = 3L;
    @GlobalConstant("PHAssetCollectionSubtypeAlbumSyncedFaces")
    public static final long AlbumSyncedFaces = 4L;
    @GlobalConstant("PHAssetCollectionSubtypeAlbumSyncedAlbum")
    public static final long AlbumSyncedAlbum = 5L;
    @GlobalConstant("PHAssetCollectionSubtypeAlbumImported")
    public static final long AlbumImported = 6L;
    @GlobalConstant("PHAssetCollectionSubtypeAlbumMyPhotoStream")
    public static final long AlbumMyPhotoStream = 100L;
    @GlobalConstant("PHAssetCollectionSubtypeAlbumCloudShared")
    public static final long AlbumCloudShared = 101L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumGeneric")
    public static final long SmartAlbumGeneric = 200L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumPanoramas")
    public static final long SmartAlbumPanoramas = 201L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumVideos")
    public static final long SmartAlbumVideos = 202L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumFavorites")
    public static final long SmartAlbumFavorites = 203L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumTimelapses")
    public static final long SmartAlbumTimelapses = 204L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumAllHidden")
    public static final long SmartAlbumAllHidden = 205L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumRecentlyAdded")
    public static final long SmartAlbumRecentlyAdded = 206L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumBursts")
    public static final long SmartAlbumBursts = 207L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumSlomoVideos")
    public static final long SmartAlbumSlomoVideos = 208L;
    @GlobalConstant("PHAssetCollectionSubtypeSmartAlbumUserLibrary")
    public static final long SmartAlbumUserLibrary = 209L;
    @GlobalConstant("PHAssetCollectionSubtypeAny")
    public static final long Any = 2147483647L;
    

}
