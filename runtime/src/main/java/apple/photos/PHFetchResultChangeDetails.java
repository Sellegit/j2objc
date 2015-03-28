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
@Library("Photos/Photos.h") @Mapping("PHFetchResultChangeDetails")
public class PHFetchResultChangeDetails 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PHFetchResultChangeDetails() { }

    
    @Mapping("fetchResultBeforeChanges")
    public native PHFetchResult getFetchResultBeforeChanges();
    @Mapping("fetchResultAfterChanges")
    public native PHFetchResult getFetchResultAfterChanges();
    @Mapping("hasIncrementalChanges")
    public native boolean hasIncrementalChanges();
    @Mapping("removedIndexes")
    public native NSIndexSet getRemovedIndexes();
    @Mapping("removedObjects")
    public native NSArray<PHObject> getRemovedObjects();
    @Mapping("insertedIndexes")
    public native NSIndexSet getInsertedIndexes();
    @Mapping("insertedObjects")
    public native NSArray<PHObject> getInsertedObjects();
    @Mapping("changedIndexes")
    public native NSIndexSet getChangedIndexes();
    @Mapping("changedObjects")
    public native NSArray<PHObject> getChangedObjects();
    @Mapping("hasMoves")
    public native boolean hasMoves();

    
    
    @Mapping("enumerateMovesWithBlock:")
    public native void enumerateMoves(@Block("(@MachineSizedUInt,@MachineSizedUInt)") VoidBlock2<Long, Long> handler);
    @Mapping("changeDetailsFromFetchResult:toFetchResult:changedObjects:")
    public static native PHFetchResultChangeDetails create(PHFetchResult fromResult, PHFetchResult toResult, NSArray<?> changedObjects);

}
