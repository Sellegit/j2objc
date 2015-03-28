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


@Library("Photos/Photos.h") @Mapping("PHAssetCollectionChangeRequest")
public class PHAssetCollectionChangeRequest 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PHAssetCollectionChangeRequest() { }

    
    @Mapping("placeholderForCreatedAssetCollection")
    public native PHObjectPlaceholder getPlaceholderForCreatedAssetCollection();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);

    
    
    @Mapping("addAssets:")
    public native void addAssets(NSFastEnumeration assets);
    @Mapping("insertAssets:atIndexes:")
    public native void insertAssets(NSFastEnumeration assets, NSIndexSet indexes);
    @Mapping("removeAssets:")
    public native void removeAssets(NSFastEnumeration assets);
    @Mapping("removeAssetsAtIndexes:")
    public native void removeAssets(NSIndexSet indexes);
    @Mapping("replaceAssetsAtIndexes:withAssets:")
    public native void replaceAssets(NSIndexSet indexes, NSFastEnumeration assets);
    @Mapping("moveAssetsAtIndexes:toIndex:")
    public native void moveAssetsTo(NSIndexSet fromIndexes, @MachineSizedUInt long toIndex);
    @Mapping("creationRequestForAssetCollectionWithTitle:")
    public static native PHAssetCollectionChangeRequest createAssetCollectionCreationRequest(String title);
    @Mapping("deleteAssetCollections:")
    public static native void deleteAssetCollections(NSFastEnumeration assetCollections);
    @Mapping("changeRequestForAssetCollection:")
    public static native PHAssetCollectionChangeRequest create(PHAssetCollection assetCollection);
    @Mapping("changeRequestForAssetCollection:assets:")
    public static native PHAssetCollectionChangeRequest create(PHAssetCollection assetCollection, PHFetchResult assets);

}
