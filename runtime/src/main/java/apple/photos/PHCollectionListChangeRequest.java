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

@Library("Photos/Photos.h") @Mapping("PHCollectionListChangeRequest")
public class PHCollectionListChangeRequest 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PHCollectionListChangeRequest() { }
    
    
    @Mapping("placeholderForCreatedCollectionList")
    public native PHObjectPlaceholder getPlaceholderForCreatedCollectionList();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    
    
    
    @Mapping("addChildCollections:")
    public native void addChildCollections(NSFastEnumeration collections);
    @Mapping("insertChildCollections:atIndexes:")
    public native void insertChildCollections(NSFastEnumeration collections, NSIndexSet indexes);
    @Mapping("removeChildCollections:")
    public native void removeChildCollections(NSFastEnumeration collections);
    @Mapping("removeChildCollectionsAtIndexes:")
    public native void removeChildCollections(NSIndexSet indexes);
    @Mapping("replaceChildCollectionsAtIndexes:withChildCollections:")
    public native void replaceChildCollections(NSIndexSet indexes, NSFastEnumeration collections);
    @Mapping("moveChildCollectionsAtIndexes:toIndex:")
    public native void moveChildCollectionsTo(NSIndexSet indexes, @MachineSizedUInt long toIndex);
    @Mapping("creationRequestForCollectionListWithTitle:")
    public static native PHCollectionListChangeRequest createCollectionListCreationRequest(String title);
    @Mapping("deleteCollectionLists:")
    public static native void deleteCollectionLists(NSFastEnumeration collectionLists);
    @Mapping("changeRequestForCollectionList:")
    public static native PHCollectionListChangeRequest create(PHCollectionList collectionList);
    @Mapping("changeRequestForCollectionList:childCollections:")
    public static native PHCollectionListChangeRequest create(PHCollectionList collectionList, PHFetchResult childCollections);
    
}
