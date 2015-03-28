package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIDocumentPickerDelegateAdapter 
    extends Object 
    implements UIDocumentPickerDelegate {

    
    
    


    
    
    @NotImplemented("documentPicker:didPickDocumentAtURL:")
    public void didPickDocument(UIDocumentPickerViewController controller, NSURL url) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentPickerWasCancelled:")
    public void wasCancelled(UIDocumentPickerViewController controller) { throw new UnsupportedOperationException(); }

}
