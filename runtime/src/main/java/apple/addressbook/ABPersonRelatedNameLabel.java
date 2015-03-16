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
public class ABPersonRelatedNameLabel 
    extends ABPropertyLabel 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonFatherLabel")
    protected static native CFString FatherLabel();
    @GlobalConstant("kABPersonMotherLabel")
    protected static native CFString MotherLabel();
    @GlobalConstant("kABPersonParentLabel")
    protected static native CFString ParentLabel();
    @GlobalConstant("kABPersonBrotherLabel")
    protected static native CFString BrotherLabel();
    @GlobalConstant("kABPersonSisterLabel")
    protected static native CFString SisterLabel();
    @GlobalConstant("kABPersonChildLabel")
    protected static native CFString ChildLabel();
    @GlobalConstant("kABPersonFriendLabel")
    protected static native CFString FriendLabel();
    @GlobalConstant("kABPersonSpouseLabel")
    protected static native CFString SpouseLabel();
    @GlobalConstant("kABPersonPartnerLabel")
    protected static native CFString PartnerLabel();
    @GlobalConstant("kABPersonAssistantLabel")
    protected static native CFString AssistantLabel();
    @GlobalConstant("kABPersonManagerLabel")
    protected static native CFString ManagerLabel();
    
}
