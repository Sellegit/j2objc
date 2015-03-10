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





@Library("CoreData") @Mapping("NSFetchedResultsControllerDelegate")
public interface NSFetchedResultsControllerDelegate 
     {

    
    
    
    
    
    @Mapping("controller:didChangeObject:atIndexPath:forChangeType:newIndexPath:")
    void didChangeObject(NSFetchedResultsController controller, Object anObject, NSIndexPath indexPath, @Representing("NSFetchedResultsChangeType") @MachineSizedUInt long type, NSIndexPath newIndexPath);
    @Mapping("controller:didChangeSection:atIndex:forChangeType:")
    void didChangeSection(NSFetchedResultsController controller, NSFetchedResultsSectionInfo sectionInfo, @MachineSizedUInt long sectionIndex, @Representing("NSFetchedResultsChangeType") @MachineSizedUInt long type);
    @Mapping("controllerWillChangeContent:")
    void willChangeContent(NSFetchedResultsController controller);
    @Mapping("controllerDidChangeContent:")
    void didChangeContent(NSFetchedResultsController controller);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("controller:sectionIndexTitleForSectionName:")
    String getSectionIndexTitle(NSFetchedResultsController controller, String sectionName);
    
    /*<adapter>*/
    /*</adapter>*/
}
