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
@Library("AddressBook/AddressBook.h")
public class ABMutableMultiValue 
    extends ABMultiValue 
     {

    
    
    
    
    
    @GlobalFunction("ABMultiValueCreateMutable")
    public static native CFType create(@Representing("ABPropertyType") long type);
    @GlobalFunction("ABMultiValueCreateMutableCopy")
    public static native CFType create(ABMultiValueRef multiValue);
    @GlobalFunction("ABMultiValueAddValueAndLabel")
    public static native boolean addValueAndLabel(CFType multiValue, CFType value, String label, Todo outIdentifier);
    @GlobalFunction("ABMultiValueInsertValueAndLabelAtIndex")
    public static native boolean insertValueAndLabel(CFType multiValue, CFType value, String label, @MachineSizedSInt long index, Todo outIdentifier);
    @GlobalFunction("ABMultiValueRemoveValueAndLabelAtIndex")
    public static native boolean removeValueAndLabel(CFType multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueReplaceValueAtIndex")
    public static native boolean replaceValue(CFType multiValue, CFType value, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueReplaceLabelAtIndex")
    public static native boolean replaceLabel(CFType multiValue, String label, @MachineSizedSInt long index);
    
}
