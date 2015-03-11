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
public abstract class UIVideoEditorControllerDelegateAdapter 
    extends UINavigationControllerDelegateAdapter 
    implements UIVideoEditorControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("videoEditorController:didSaveEditedVideoToPath:")
    public void didSave(UIVideoEditorController editor, String editedVideoPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("videoEditorController:didFailWithError:")
    public void didFail(UIVideoEditorController editor, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("videoEditorControllerDidCancel:")
    public void didCancel(UIVideoEditorController editor) { throw new UnsupportedOperationException(); }
    
}
