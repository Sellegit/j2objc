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
public abstract class UITextInputTraitsAdapter 
    extends Object 
    implements UITextInputTraits {

    
    
    
    @NotImplemented("autocapitalizationType")
    public @Representing("UITextAutocapitalizationType") long getAutocapitalizationType() { throw new UnsupportedOperationException(); }
    @Mapping("setAutocapitalizationType:")
    public void setAutocapitalizationType(@Representing("UITextAutocapitalizationType") long v) { throw new UnsupportedOperationException(); }
    @NotImplemented("autocorrectionType")
    public @Representing("UITextAutocorrectionType") long getAutocorrectionType() { throw new UnsupportedOperationException(); }
    @Mapping("setAutocorrectionType:")
    public void setAutocorrectionType(@Representing("UITextAutocorrectionType") long v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("spellCheckingType")
    public @Representing("UITextSpellCheckingType") long getSpellCheckingType() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSpellCheckingType:")
    public void setSpellCheckingType(@Representing("UITextSpellCheckingType") long v) { throw new UnsupportedOperationException(); }
    @NotImplemented("keyboardType")
    public @Representing("UIKeyboardType") long getKeyboardType() { throw new UnsupportedOperationException(); }
    @Mapping("setKeyboardType:")
    public void setKeyboardType(@Representing("UIKeyboardType") long v) { throw new UnsupportedOperationException(); }
    @NotImplemented("keyboardAppearance")
    public @Representing("UIKeyboardAppearance") long getKeyboardAppearance() { throw new UnsupportedOperationException(); }
    @Mapping("setKeyboardAppearance:")
    public void setKeyboardAppearance(@Representing("UIKeyboardAppearance") long v) { throw new UnsupportedOperationException(); }
    @NotImplemented("returnKeyType")
    public @Representing("UIReturnKeyType") long getReturnKeyType() { throw new UnsupportedOperationException(); }
    @Mapping("setReturnKeyType:")
    public void setReturnKeyType(@Representing("UIReturnKeyType") long v) { throw new UnsupportedOperationException(); }
    @NotImplemented("enablesReturnKeyAutomatically")
    public boolean enablesReturnKeyAutomatically() { throw new UnsupportedOperationException(); }
    @Mapping("setEnablesReturnKeyAutomatically:")
    public void setEnablesReturnKeyAutomatically(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("isSecureTextEntry")
    public boolean isSecureTextEntry() { throw new UnsupportedOperationException(); }
    @Mapping("setSecureTextEntry:")
    public void setSecureTextEntry(boolean v) { throw new UnsupportedOperationException(); }
    
    
    
    
    
}
