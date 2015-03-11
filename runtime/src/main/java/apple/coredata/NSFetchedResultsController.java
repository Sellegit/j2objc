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

@Library("CoreData") @Mapping("NSFetchedResultsController")
public class NSFetchedResultsController 
    extends NSObject 
     {

    
    
    public NSFetchedResultsController() {}
    @Mapping("initWithFetchRequest:managedObjectContext:sectionNameKeyPath:cacheName:")
    public NSFetchedResultsController(NSFetchRequest fetchRequest, NSManagedObjectContext context, String sectionNameKeyPath, String name) { }
    
    
    @Mapping("fetchRequest")
    public native NSFetchRequest getFetchRequest();
    @Mapping("managedObjectContext")
    public native NSManagedObjectContext getManagedObjectContext();
    @Mapping("sectionNameKeyPath")
    public native String getSectionNameKeyPath();
    @Mapping("cacheName")
    public native String getCacheName();
    @Mapping("delegate")
    public native NSFetchedResultsControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSFetchedResultsControllerDelegate v);
    @Mapping("fetchedObjects")
    public native NSArray<NSManagedObject> getFetchedObjects();
    @Mapping("sectionIndexTitles")
    public native List<String> getSectionIndexTitles();
    @Mapping("sections")
    public native List<NSFetchedResultsSectionInfo> getSections();
    
    
    
    @Mapping("performFetch:")
    protected native boolean performFetch(Todo error);
    @Mapping("objectAtIndexPath:")
    public native Object getObjectAtIndexPath(NSIndexPath indexPath);
    @Mapping("indexPathForObject:")
    public native NSIndexPath getIndexPathForObject(Object object);
    @Mapping("sectionIndexTitleForSectionName:")
    public native String getSectionIndexTitleForSectionName(String sectionName);
    @Mapping("sectionForSectionIndexTitle:atIndex:")
    public native @MachineSizedSInt long getSectionForIndexTitle(String title, @MachineSizedSInt long sectionIndex);
    @Mapping("deleteCacheWithName:")
    public static native void deleteCache(String name);
    
}
