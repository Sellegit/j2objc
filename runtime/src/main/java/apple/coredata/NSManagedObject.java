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
@Library("CoreData/CoreData.h") @Mapping("NSManagedObject")
public class NSManagedObject 
    extends NSObject 
     {

    
    
    @Mapping("initWithEntity:insertIntoManagedObjectContext:")
    public NSManagedObject(NSEntityDescription entity, NSManagedObjectContext context) { }
    @Mapping("init")
    public NSManagedObject() { }

    
    @Mapping("managedObjectContext")
    public native NSManagedObjectContext getManagedObjectContext();
    @Mapping("entity")
    public native NSEntityDescription getEntity();
    @Mapping("objectID")
    public native NSManagedObjectID getObjectID();
    @Mapping("isInserted")
    public native boolean isInserted();
    @Mapping("isUpdated")
    public native boolean isUpdated();
    @Mapping("isDeleted")
    public native boolean isDeleted();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("hasChanges")
    public native boolean hasChanges();
    @Mapping("isFault")
    public native boolean isFault();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("faultingState")
    public native @MachineSizedUInt long getFaultingState();

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("hasFaultForRelationshipNamed:")
    public native boolean hasFaultForRelationship(String key);
    @Mapping("willAccessValueForKey:")
    public native void willAccessValue(String key);
    @Mapping("didAccessValueForKey:")
    public native void didAccessValue(String key);
    @Mapping("willChangeValueForKey:")
    public native void willChangeValue(String key);
    @Mapping("didChangeValueForKey:")
    public native void didChangeValue(String key);
    @Mapping("willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValue(String inKey, @Representing("NSKeyValueSetMutationKind") long inMutationKind, NSSet<?> inObjects);
    @Mapping("didChangeValueForKey:withSetMutation:usingObjects:")
    public native void didChangeValue(String inKey, @Representing("NSKeyValueSetMutationKind") long inMutationKind, NSSet<?> inObjects);
    @Mapping("awakeFromFetch")
    public native void awakeFromFetch();
    @Mapping("awakeFromInsert")
    public native void awakeFromInsert();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("awakeFromSnapshotEvents:")
    public native void awakeFromSnapshotEvents(@Representing("NSSnapshotEventType") long flags);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("prepareForDeletion")
    public native void prepareForDeletion();
    @Mapping("willSave")
    public native void willSave();
    @Mapping("didSave")
    public native void didSave();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("willTurnIntoFault")
    public native void willTurnIntoFault();
    @Mapping("didTurnIntoFault")
    public native void didTurnIntoFault();
    @Mapping("valueForKey:")
    public native Object getValue(String key);
    @Mapping("setValue:forKey:")
    public native void setValue(Object value, String key);
    @Mapping("primitiveValueForKey:")
    public native Object getPrimitiveValue(String key);
    @Mapping("setPrimitiveValue:forKey:")
    public native void setPrimitiveValue(Object value, String key);
    @Mapping("committedValuesForKeys:")
    public native Map<String, NSObject> getCommittedValues(NSArray<?> keys);
    @Mapping("changedValues")
    public native Map<String, NSObject> getChangedValues();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("changedValuesForCurrentEvent")
    public native Map<String, NSObject> getChangedValuesForCurrentEvent();
    @Mapping("validateValue:forKey:error:")
    public native boolean validateValue(Todo value, String key, Todo error);
    @Mapping("validateForDelete:")
    public native boolean validateForDelete(Todo error);
    @Mapping("validateForInsert:")
    public native boolean validateForInsert(Todo error);
    @Mapping("validateForUpdate:")
    public native boolean validateForUpdate(Todo error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("contextShouldIgnoreUnmodeledPropertyChanges")
    public static native boolean shouldContextIgnoreUnmodeledPropertyChanges();

}
