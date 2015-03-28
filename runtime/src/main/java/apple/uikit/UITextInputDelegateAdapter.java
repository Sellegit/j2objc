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
public abstract class UITextInputDelegateAdapter 
    extends Object 
    implements UITextInputDelegate {

    
    
    


    
    
    @NotImplemented("selectionWillChange:")
    public void selectionWillChange(UITextInput textInput) { throw new UnsupportedOperationException(); }
    @NotImplemented("selectionDidChange:")
    public void selectionDidChange(UITextInput textInput) { throw new UnsupportedOperationException(); }
    @NotImplemented("textWillChange:")
    public void textWillChange(UITextInput textInput) { throw new UnsupportedOperationException(); }
    @NotImplemented("textDidChange:")
    public void textDidChange(UITextInput textInput) { throw new UnsupportedOperationException(); }

}
