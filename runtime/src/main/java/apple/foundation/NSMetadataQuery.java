package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("Foundation") @Mapping("NSMetadataQuery")
public class NSMetadataQuery 
    extends NSObject 
     {

    
    
    public NSMetadataQuery() {}
    
    
    @Mapping("delegate")
    public native NSMetadataQueryDelegate getDelegate();
    public native void setDelegate(NSMetadataQueryDelegate v);
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    public native void setPredicate(NSPredicate v);
    @Mapping("sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    public native void setSortDescriptors(NSArray<NSSortDescriptor> v);
    @Mapping("valueListAttributes")
    public native List<NSMetadataItemAttribute> getValueListAttributes();
    public native void setValueListAttributes(List<NSMetadataItemAttribute> v);
    @Mapping("groupingAttributes")
    public native List<NSMetadataItemAttribute> getGroupingAttributes();
    public native void setGroupingAttributes(List<NSMetadataItemAttribute> v);
    @Mapping("notificationBatchingInterval")
    public native double getNotificationBatchingInterval();
    public native void setNotificationBatchingInterval(double v);
    @Mapping("searchScopes")
    protected native NSArray<?> getSearchScopes0();
    protected native void setSearchScopes0(NSArray<?> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("searchItems")
    protected native NSArray<?> getSearchItems0();
    /**
     * @since Available in iOS 7.0 and later.
     */
    protected native void setSearchItems0(NSArray<?> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("operationQueue")
    public native NSOperationQueue getOperationQueue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setOperationQueue(NSOperationQueue v);
    @Mapping("isStarted")
    public native boolean isStarted();
    @Mapping("isGathering")
    public native boolean isGathering();
    @Mapping("isStopped")
    public native boolean isStopped();
    @Mapping("resultCount")
    public native @MachineSizedUInt long getResultCount();
    @Mapping("results")
    public native NSArray<NSMetadataItem> getResults();
    @Mapping("valueLists")
    protected native NSDictionary<NSString, NSMetadataQueryAttributeValueTuple> getValueLists0();
    @Mapping("groupedResults")
    public native NSArray<NSMetadataQueryResultGroup> getGroupedResults();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataQueryDidStartGatheringNotification")
    public static native NSString DidStartGatheringNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataQueryGatheringProgressNotification")
    public static native NSString GatheringProgressNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataQueryDidFinishGatheringNotification")
    public static native NSString DidFinishGatheringNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataQueryDidUpdateNotification")
    public static native NSString DidUpdateNotification();
    
    @Mapping("startQuery")
    public native boolean startQuery();
    @Mapping("stopQuery")
    public native void stopQuery();
    @Mapping("disableUpdates")
    public native void disableUpdates();
    @Mapping("enableUpdates")
    public native void enableUpdates();
    @Mapping("resultAtIndex:")
    public native NSMetadataItem getResult(@MachineSizedUInt long idx);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("enumerateResultsUsingBlock:")
    public native void enumerateResults(@Block("(,@MachineSizedUInt,)") VoidBlock3<NSMetadataItem, Long, Todo> block);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("enumerateResultsWithOptions:usingBlock:")
    public native void enumerateResults(@Representing("NSEnumerationOptions") @MachineSizedUInt long opts, @Block("(,@MachineSizedUInt,)") VoidBlock3<NSMetadataItem, Long, Todo> block);
    @Mapping("indexOfResult:")
    public native @MachineSizedUInt long indexOfResult(NSMetadataItem result);
    @Mapping("valueOfAttribute:forResultAtIndex:")
    public native Object getValueForResult(NSMetadataItemAttribute attrName, @MachineSizedUInt long idx);
    
}
