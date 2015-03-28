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
public abstract class UITextFieldDelegateAdapter 
    extends Object 
    implements UITextFieldDelegate {

    
    
    


    
    
    @NotImplemented("textFieldShouldBeginEditing:")
    public boolean shouldBeginEditing(UITextField textField) { throw new UnsupportedOperationException(); }
    @NotImplemented("textFieldDidBeginEditing:")
    public void didBeginEditing(UITextField textField) { throw new UnsupportedOperationException(); }
    @NotImplemented("textFieldShouldEndEditing:")
    public boolean shouldEndEditing(UITextField textField) { throw new UnsupportedOperationException(); }
    @NotImplemented("textFieldDidEndEditing:")
    public void didEndEditing(UITextField textField) { throw new UnsupportedOperationException(); }
    @NotImplemented("textField:shouldChangeCharactersInRange:replacementString:")
    public boolean shouldChangeCharacters(UITextField textField, NSRange range, String string) { throw new UnsupportedOperationException(); }
    @NotImplemented("textFieldShouldClear:")
    public boolean shouldClear(UITextField textField) { throw new UnsupportedOperationException(); }
    @NotImplemented("textFieldShouldReturn:")
    public boolean shouldReturn(UITextField textField) { throw new UnsupportedOperationException(); }

}
