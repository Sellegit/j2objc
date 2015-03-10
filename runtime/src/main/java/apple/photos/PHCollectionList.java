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

@Library("Photos") @Mapping("PHCollectionList")
public class PHCollectionList 
    extends PHCollection 
     {

    
    
    public PHCollectionList() {}
    
    
    @Mapping("collectionListType")
    public native @Representing("PHCollectionListType") @MachineSizedSInt long getCollectionListType();
    @Mapping("collectionListSubtype")
    public native @Representing("PHCollectionListSubtype") @MachineSizedSInt long getCollectionListSubtype();
    @Mapping("startDate")
    public native NSDate getStartDate();
    @Mapping("endDate")
    public native NSDate getEndDate();
    @Mapping("localizedLocationNames")
    public native List<String> getLocalizedLocationNames();
    
    
    
    @Mapping("fetchCollectionListsContainingCollection:options:")
    public static native PHFetchResult fetchCollectionListsContainingCollection(PHCollection collection, PHFetchOptions options);
    @Mapping("fetchCollectionListsWithLocalIdentifiers:options:")
    public static native PHFetchResult fetchCollectionListsWithLocalIdentifiers(List<String> identifiers, PHFetchOptions options);
    @Mapping("fetchCollectionListsWithType:subtype:options:")
    public static native PHFetchResult fetchCollectionListsWithType(@Representing("PHCollectionListType") @MachineSizedSInt long collectionListType, @Representing("PHCollectionListSubtype") @MachineSizedSInt long subtype, PHFetchOptions options);
    @Mapping("fetchMomentListsWithSubtype:containingMoment:options:")
    public static native PHFetchResult fetchMomentListsWithSubtypeContainingMoment(@Representing("PHCollectionListSubtype") @MachineSizedSInt long momentListSubtype, PHAssetCollection moment, PHFetchOptions options);
    @Mapping("fetchMomentListsWithSubtype:options:")
    public static native PHFetchResult fetchMomentListsWithSubtype(@Representing("PHCollectionListSubtype") @MachineSizedSInt long momentListSubtype, PHFetchOptions options);
    @Mapping("transientCollectionListWithCollections:title:")
    public static native PHCollectionList createTransientCollectionList(NSArray<PHCollection> collections, String title);
    @Mapping("transientCollectionListWithCollectionsFetchResult:title:")
    public static native PHCollectionList createTransientCollectionList(PHFetchResult fetchResult, String title);
    
}
