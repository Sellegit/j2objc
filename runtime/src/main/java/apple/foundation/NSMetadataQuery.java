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
    @Mapping("setDelegate:")
    public native void setDelegate(NSMetadataQueryDelegate v);
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    @Mapping("setPredicate:")
    public native void setPredicate(NSPredicate v);
    @Mapping("sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    @Mapping("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<NSSortDescriptor> v);
    @Mapping("valueListAttributes")
    public native List<NSMetadataItemAttribute> getValueListAttributes();
    @Mapping("setValueListAttributes:")
    public native void setValueListAttributes(List<NSMetadataItemAttribute> v);
    @Mapping("groupingAttributes")
    public native List<NSMetadataItemAttribute> getGroupingAttributes();
    @Mapping("setGroupingAttributes:")
    public native void setGroupingAttributes(List<NSMetadataItemAttribute> v);
    @Mapping("notificationBatchingInterval")
    public native double getNotificationBatchingInterval();
    @Mapping("setNotificationBatchingInterval:")
    public native void setNotificationBatchingInterval(double v);
    @Mapping("searchScopes")
    protected native NSArray<?> getSearchScopes0();
    @Mapping("setSearchScopes:")
    protected native void setSearchScopes0(NSArray<?> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("searchItems")
    protected native NSArray<?> getSearchItems0();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSearchItems:")
    protected native void setSearchItems0(NSArray<?> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("operationQueue")
    public native NSOperationQueue getOperationQueue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setOperationQueue:")
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
    @Mapping("indexOfResult:")
    public native @MachineSizedUInt long indexOfResult(Object result);
    @Mapping("valueOfAttribute:forResultAtIndex:")
    public native Object getValueForResult(String attrName, @MachineSizedUInt long idx);
    
}
