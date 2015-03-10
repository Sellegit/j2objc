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
public abstract class UIStateRestoringAdapter 
    extends Object 
    implements UIStateRestoring {

    
    
    
    @NotImplemented("restorationParent")
    public UIStateRestoring getRestorationParent() { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("encodeRestorableStateWithCoder:")
    public void encodeRestorableState(NSCoder coder) { throw new UnsupportedOperationException(); }
    @NotImplemented("decodeRestorableStateWithCoder:")
    public void decodeRestorableState(NSCoder coder) { throw new UnsupportedOperationException(); }
    @NotImplemented("applicationFinishedRestoringState")
    public void applicationFinishedRestoringState() { throw new UnsupportedOperationException(); }
    
}
