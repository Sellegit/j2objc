package apple.addressbook;


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
@Library("AddressBook")
public class ABMutableMultiValue 
    extends ABMultiValue 
     {

    
    
    
    
    
    @GlobalFunction("ABMultiValueCreateMutable")
    public static native ABMutableMultiValue create(ABPropertyType type);
    @GlobalFunction("ABMultiValueCreateMutableCopy")
    public static native ABMutableMultiValue create(ABMultiValue multiValue);
    @GlobalFunction("ABMultiValueAddValueAndLabel")
    protected native boolean addValueAndLabel(CFType value, CFString label, Todo outIdentifier);
    @GlobalFunction("ABMultiValueInsertValueAndLabelAtIndex")
    protected native boolean insertValueAndLabel(CFType value, CFString label, @MachineSizedSInt long index, Todo outIdentifier);
    @GlobalFunction("ABMultiValueRemoveValueAndLabelAtIndex")
    public native boolean removeValueAndLabel(@MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueReplaceValueAtIndex")
    public native boolean replaceValue(CFType value, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueReplaceLabelAtIndex")
    protected native boolean replaceLabel(CFString label, @MachineSizedSInt long index);
    
}
