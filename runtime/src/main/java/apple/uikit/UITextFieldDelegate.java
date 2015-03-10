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





@Library("UIKit") @Mapping("UITextFieldDelegate")
public interface UITextFieldDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("textFieldShouldBeginEditing:")
    boolean shouldBeginEditing(UITextField textField);
    @Mapping("textFieldDidBeginEditing:")
    void didBeginEditing(UITextField textField);
    @Mapping("textFieldShouldEndEditing:")
    boolean shouldEndEditing(UITextField textField);
    @Mapping("textFieldDidEndEditing:")
    void didEndEditing(UITextField textField);
    @Mapping("textField:shouldChangeCharactersInRange:replacementString:")
    boolean shouldChangeCharacters(UITextField textField, NSRange range, String string);
    @Mapping("textFieldShouldClear:")
    boolean shouldClear(UITextField textField);
    @Mapping("textFieldShouldReturn:")
    boolean shouldReturn(UITextField textField);
    
    /*<adapter>*/
    /*</adapter>*/
}
