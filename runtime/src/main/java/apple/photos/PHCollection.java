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

@Library("Photos/Photos.h") @Mapping("PHCollection")
public class PHCollection 
    extends PHObject 
     {

    
    
    @Mapping("init")
    public PHCollection() { }
    
    
    @Mapping("canContainAssets")
    public native boolean canContainAssets();
    @Mapping("canContainCollections")
    public native boolean canContainCollections();
    @Mapping("localizedTitle")
    public native String getLocalizedTitle();
    
    
    
    @Mapping("canPerformEditOperation:")
    public native boolean canPerformEditOperation(@Representing("PHCollectionEditOperation") @MachineSizedSInt long anOperation);
    @Mapping("fetchCollectionsInCollectionList:options:")
    public static native PHFetchResult fetchCollectionsInCollectionList(PHCollectionList collectionList, PHFetchOptions options);
    @Mapping("fetchTopLevelUserCollectionsWithOptions:")
    public static native PHFetchResult fetchTopLevelUserCollections(PHFetchOptions options);
    
}
