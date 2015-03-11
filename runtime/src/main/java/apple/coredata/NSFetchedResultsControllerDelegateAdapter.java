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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSFetchedResultsControllerDelegateAdapter 
    extends Object 
    implements NSFetchedResultsControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("controller:didChangeObject:atIndexPath:forChangeType:newIndexPath:")
    public void didChangeObject(NSFetchedResultsController controller, Object anObject, NSIndexPath indexPath, @Representing("NSFetchedResultsChangeType") @MachineSizedUInt long type, NSIndexPath newIndexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("controller:didChangeSection:atIndex:forChangeType:")
    public void didChangeSection(NSFetchedResultsController controller, NSFetchedResultsSectionInfo sectionInfo, @MachineSizedUInt long sectionIndex, @Representing("NSFetchedResultsChangeType") @MachineSizedUInt long type) { throw new UnsupportedOperationException(); }
    @NotImplemented("controllerWillChangeContent:")
    public void willChangeContent(NSFetchedResultsController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("controllerDidChangeContent:")
    public void didChangeContent(NSFetchedResultsController controller) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("controller:sectionIndexTitleForSectionName:")
    public String getSectionIndexTitle(NSFetchedResultsController controller, String sectionName) { throw new UnsupportedOperationException(); }
    
}
