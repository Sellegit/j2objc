package apple.cloudkit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CloudKit") @Mapping("CKQueryOperation")
public class CKQueryOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKQueryOperation() {}
    @Mapping("initWithQuery:")
    public CKQueryOperation(CKQuery query) { }
    @Mapping("initWithCursor:")
    public CKQueryOperation(CKQueryCursor cursor) { }
    
    
    @Mapping("query")
    public native CKQuery getQuery();
    @Mapping("setQuery:")
    public native void setQuery(CKQuery v);
    @Mapping("cursor")
    public native CKQueryCursor getCursor();
    @Mapping("setCursor:")
    public native void setCursor(CKQueryCursor v);
    @Mapping("zoneID")
    public native CKRecordZoneID getZoneID();
    @Mapping("setZoneID:")
    public native void setZoneID(CKRecordZoneID v);
    @Mapping("resultsLimit")
    public native @MachineSizedUInt long getResultsLimit();
    @Mapping("setResultsLimit:")
    public native void setResultsLimit(@MachineSizedUInt long v);
    @Mapping("desiredKeys")
    public native List<String> getDesiredKeys();
    @Mapping("setDesiredKeys:")
    public native void setDesiredKeys(List<String> v);
    @Mapping("recordFetchedBlock")
    public native @Block VoidBlock1<CKRecord> getRecordFetchedBlock();
    @Mapping("setRecordFetchedBlock:")
    public native void setRecordFetchedBlock(@Block VoidBlock1<CKRecord> v);
    @Mapping("queryCompletionBlock")
    public native @Block VoidBlock2<CKQueryCursor, NSError> getQueryCompletionBlock();
    @Mapping("setQueryCompletionBlock:")
    public native void setQueryCompletionBlock(@Block VoidBlock2<CKQueryCursor, NSError> v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CKQueryOperationMaximumResults")
    public static native @MachineSizedUInt long getMaximumResults();
    
    
    
}
