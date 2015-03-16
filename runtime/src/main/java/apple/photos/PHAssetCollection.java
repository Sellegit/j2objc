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

@Library("Photos/Photos.h") @Mapping("PHAssetCollection")
public class PHAssetCollection 
    extends PHCollection 
     {

    
    
    public PHAssetCollection() {}
    
    
    @Mapping("assetCollectionType")
    public native @Representing("PHAssetCollectionType") @MachineSizedSInt long getAssetCollectionType();
    @Mapping("assetCollectionSubtype")
    public native @Representing("PHAssetCollectionSubtype") @MachineSizedSInt long getAssetCollectionSubtype();
    @Mapping("estimatedAssetCount")
    public native @MachineSizedUInt long getEstimatedAssetCount();
    @Mapping("startDate")
    public native NSDate getStartDate();
    @Mapping("endDate")
    public native NSDate getEndDate();
    @Mapping("approximateLocation")
    public native CLLocation getApproximateLocation();
    @Mapping("localizedLocationNames")
    public native List<String> getLocalizedLocationNames();
    
    
    
    @Mapping("fetchAssetCollectionsWithLocalIdentifiers:options:")
    public static native PHFetchResult fetchAssetCollectionsWithLocalIdentifiers(NSArray<?> identifiers, PHFetchOptions options);
    @Mapping("fetchAssetCollectionsWithType:subtype:options:")
    public static native PHFetchResult fetchAssetCollectionsWithType(@Representing("PHAssetCollectionType") @MachineSizedSInt long type, @Representing("PHAssetCollectionSubtype") @MachineSizedSInt long subtype, PHFetchOptions options);
    @Mapping("fetchAssetCollectionsContainingAsset:withType:options:")
    public static native PHFetchResult fetchAssetCollectionsContainingAsset(PHAsset asset, @Representing("PHAssetCollectionType") @MachineSizedSInt long type, PHFetchOptions options);
    @Mapping("fetchAssetCollectionsWithALAssetGroupURLs:options:")
    public static native PHFetchResult fetchAssetCollectionsWithALAssetGroupURLs(NSArray<?> assetGroupURLs, PHFetchOptions options);
    @Mapping("fetchMomentsInMomentList:options:")
    public static native PHFetchResult fetchMomentsInMomentList(PHCollectionList momentList, PHFetchOptions options);
    @Mapping("fetchMomentsWithOptions:")
    public static native PHFetchResult fetchMoments(PHFetchOptions options);
    @Mapping("transientAssetCollectionWithAssets:title:")
    public static native PHAssetCollection createTransientAssetCollection(NSArray<?> assets, String title);
    @Mapping("transientAssetCollectionWithAssetFetchResult:title:")
    public static native PHAssetCollection createTransientAssetCollection(PHFetchResult fetchResult, String title);
    
}
