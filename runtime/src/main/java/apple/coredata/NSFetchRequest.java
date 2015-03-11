package apple.coredata;


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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("CoreData") @Mapping("NSFetchRequest")
public class NSFetchRequest 
    extends NSPersistentStoreRequest 
    implements NSCoding {

    
    
    public NSFetchRequest() {}
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithEntityName:")
    public NSFetchRequest(String entityName) { }
    
    
    @Mapping("entity")
    public native NSEntityDescription getEntity();
    @Mapping("setEntity:")
    public native void setEntity(NSEntityDescription v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("entityName")
    public native String getEntityName();
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    @Mapping("setPredicate:")
    public native void setPredicate(NSPredicate v);
    @Mapping("sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    @Mapping("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<NSSortDescriptor> v);
    @Mapping("fetchLimit")
    public native @MachineSizedUInt long getFetchLimit();
    @Mapping("setFetchLimit:")
    public native void setFetchLimit(@MachineSizedUInt long v);
    @Mapping("affectedStores")
    public native List<String> getAffectedStores();
    @Mapping("setAffectedStores:")
    public native void setAffectedStores(List<String> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("resultType")
    public native @Representing("NSFetchRequestResultType") @MachineSizedUInt long getResultType();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setResultType:")
    public native void setResultType(@Representing("NSFetchRequestResultType") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("includesSubentities")
    public native boolean includesSubentities();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setIncludesSubentities:")
    public native void setIncludesSubentities(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("includesPropertyValues")
    public native boolean includesPropertyValues();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setIncludesPropertyValues:")
    public native void setIncludesPropertyValues(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("returnsObjectsAsFaults")
    public native boolean returnsObjectsAsFaults();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setReturnsObjectsAsFaults:")
    public native void setReturnsObjectsAsFaults(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("relationshipKeyPathsForPrefetching")
    public native List<String> getRelationshipKeyPathsForPrefetching();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setRelationshipKeyPathsForPrefetching:")
    public native void setRelationshipKeyPathsForPrefetching(List<String> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("includesPendingChanges")
    public native boolean includesPendingChanges();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setIncludesPendingChanges:")
    public native void setIncludesPendingChanges(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("returnsDistinctResults")
    public native boolean returnsDistinctResults();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setReturnsDistinctResults:")
    public native void setReturnsDistinctResults(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("propertiesToFetch")
    public native NSArray<NSPropertyDescription> getPropertiesToFetch();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setPropertiesToFetch:")
    public native void setPropertiesToFetch(NSArray<NSPropertyDescription> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("fetchOffset")
    public native @MachineSizedUInt long getFetchOffset();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setFetchOffset:")
    public native void setFetchOffset(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("fetchBatchSize")
    public native @MachineSizedUInt long getFetchBatchSize();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setFetchBatchSize:")
    public native void setFetchBatchSize(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shouldRefreshRefetchedObjects")
    public native boolean shouldRefreshRefetchedObjects();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setShouldRefreshRefetchedObjects:")
    public native void setShouldRefreshRefetchedObjects(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("propertiesToGroupBy")
    public native NSArray<NSPropertyDescription> getPropertiesToGroupBy();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setPropertiesToGroupBy:")
    public native void setPropertiesToGroupBy(NSArray<NSPropertyDescription> v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("havingPredicate")
    public native NSPredicate getHavingPredicate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setHavingPredicate:")
    public native void setHavingPredicate(NSPredicate v);
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fetchRequestWithEntityName:")
    public static native NSFetchRequest create(String entityName);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
