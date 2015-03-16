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





@Library("CoreData/CoreData.h") @Mapping("NSFetchedResultsSectionInfo")
public interface NSFetchedResultsSectionInfo 
     {

    
    
    @Mapping("name")
    String getName();
    @Mapping("indexTitle")
    String getIndexTitle();
    @Mapping("numberOfObjects")
    @MachineSizedUInt long getNumberOfObjects();
    @Mapping("objects")
    NSArray<NSManagedObject> getObjects();
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
