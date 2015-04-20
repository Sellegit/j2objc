// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

//
//  JavaToIOSInputStreamAdapter.m
//  JreEmulation
//
//  Created by Keith Stanger on 6/12/13.
//

#import "JavaToIOSInputStreamAdapter.h"
#import "JreEmulation.h"
#import "java/io/InputStream.h"

@implementation JavaToIOSInputStreamAdapter
{
}

- (instancetype)initWithJavaInputStream:(JavaIoInputStream *)javaStream {
  if ((self = [super init])) {
    delegate_ = RETAIN_(javaStream);

    streamStatus = NSStreamStatusNotOpen;
    delegate = self;
//    runLoopEventsDict = RETAIN_([NSMapTable strongToStrongObjectsMapTable]);
//    runLoopEventsDictDummy = RETAIN_([NSMapTable strongToStrongObjectsMapTable]);
//    runLoopModesDict = RETAIN_([NSMapTable strongToStrongObjectsMapTable]);
  }
  return self;
}

+ (JavaToIOSInputStreamAdapter *)fromJavaInputStream:(JavaIoInputStream *)javaStream {
  return AUTORELEASE([[JavaToIOSInputStreamAdapter alloc] initWithJavaInputStream:javaStream]);
}

//- (NSStreamEvent)getStreamEventsOnLoop:(NSRunLoop *)loop {
//    NSLog(@"getting stream events");
//    NSStreamEvent event = [((NSNumber *) [runLoopEventsDict objectForKey:loop]) unsignedLongValue];
//    NSLog(@"got %tu", event);
//
//    return event;
//}

//- (void)setStreamEventsOnLoop:(NSRunLoop *)loop
//                 newVal:(NSStreamEvent)event {
//    NSNumber *num = [[NSNumber alloc] initWithUnsignedLong:event];
//    NSLog(@"hehe: %@", num);
//    if ([runLoopModesDict objectForKey:loop] != nil) {
//        NSLog(@"going to overwrite: %@", [runLoopEventsDict objectForKey:loop]);
////        [runLoopEventsDict setObject:num forKey:loop];
//        [runLoopEventsDictDummy setObject:num forKey:loop];
//
//        NSLog(@"verify successful put: %@", [runLoopEventsDict objectForKey:loop]);
//    }
//    NSLog(@"current num retain count: %tu", [num retainCount]);
//    [num release];
//}

//- (id)handleEvent {
//    NSLog(@"handleEvent");
//    return nil;
//    if (streamStatus == NSStreamStatusClosed) {
//        return nil;
//    }
//
//    NSStreamEvent event;
//    while ((event = [self dequeueEvent]) != NSStreamEventNone) {
//        NSLog(@"trying to send event");
//        if ([delegate respondsToSelector:@selector(stream:handleEvent:)]) {
//            NSLog(@"sending to %@", delegate);
//            NSLog(@"event %tu", event);
//            [delegate stream:self handleEvent:event];
//            NSLog(@"sent");
//        }
//    }
//
//    return nil;
//}

//- (void)enqueueEvent:(NSStreamEvent)event {
//    NSLog(@"enqueueevent");
//    @try {
//        for (id item in [runLoopModesDict keyEnumerator]) {
//            NSRunLoop *runLoop = (NSRunLoop *) item;
//            NSStreamEvent pendingEvents = [self getStreamEventsOnLoop:runLoop];
//            [self setStreamEventsOnLoop:runLoop newVal:(pendingEvents | event)];
//
//            //        [runLoop performSelector:@selector(handleEvent)
//            //                          target:self
//            //                        argument:nil
//            //                           order:0
//            //                           modes:[runLoopModesDict objectForKey:runLoop]];
//        }
//    }
//    @catch (NSError *error) {
//        NSLog(@"got error %@", error);
//    }
//    @finally {
//        NSLog(@"ending enqueue");
//    }
//}
//
//- (NSStreamEvent)dequeueEvent {
//    NSLog(@"dequeueEvent");
//    NSStreamEvent pendingEvents = [self getStreamEventsOnLoop:[NSRunLoop currentRunLoop]];
//
//    if (pendingEvents == NSStreamEventNone) {
//        return NSStreamEventNone;
//    }
//
//    NSStreamEvent event = 1UL << __builtin_ctz(pendingEvents);
//    pendingEvents ^= event;
//    [self setStreamEventsOnLoop:[NSRunLoop currentRunLoop] newVal:pendingEvents];
//
//    return event;
//}

- (void)open {
  // java.io.InputStream doesn't have an open() method.
//  NSLog(@"open");
  streamStatus = NSStreamStatusOpen;
//  [self enqueueEvent:NSStreamEventOpenCompleted];
}

- (void)close {
//  NSLog(@"close");
  [delegate_ close];
  streamStatus = NSStreamStatusClosed;
}

- (NSError *) streamError {
//  NSLog(@"stream error");
  return nil;
}

- (id<NSStreamDelegate>) delegate {
//  NSLog(@"delegate");
  return delegate;
}

- (void) setDelegate:(id<NSStreamDelegate>) ignored {
//  NSLog(@"setDelegate");
  if (ignored) {
    delegate = ignored;
  } else {
    delegate = self;
  }
}

- (void)scheduleInRunLoop:(NSRunLoop *)aRunLoop
                  forMode:(NSString *)mode {
//    NSLog(@"scheduleInRunLoop ");//, aRunLoop, mode);
//  NSMutableArray *modes = (NSMutableArray *) [runLoopModesDict objectForKey:aRunLoop];
//  if (modes == nil) {
//      modes = [[[NSMutableArray alloc] init] autorelease];
//      [runLoopModesDict setObject:modes forKey:aRunLoop];
//      [self setStreamEventsOnLoop:aRunLoop newVal:NSStreamEventNone];
//  }
//  if (![modes containsObject:mode]) {
//      [modes addObject:mode];
//  }
}

- (void)removeFromRunLoop:(NSRunLoop *)aRunLoop
                  forMode:(NSString *)mode {
//    NSLog(@"remove InRunLoop loop: %@, mode: %@", aRunLoop, mode);
//
//    NSMutableArray *modes = (NSMutableArray *) [runLoopModesDict objectForKey:aRunLoop];
//  [modes removeObject:mode];
//  if (modes.count == 0) {
//      //remove the whole runloop
//      [runLoopEventsDict removeObjectForKey:aRunLoop];
//  }
}

- (id)propertyForKey:(NSString *)key {
//  NSLog(@"property for key");
  return nil;
}

- (BOOL)setProperty:(id)property forKey:(NSString *)key {
//  NSLog(@"set property for key");
  return NO;
}

- (NSStreamStatus)streamStatus {
//  NSLog(@"stream status");
  return streamStatus;
}

- (NSInteger)read:(uint8_t *)buffer maxLength:(NSUInteger)len {
//  NSLog(@"read");
  NSStreamStatus prevStatus = streamStatus;
  streamStatus = NSStreamStatusReading;

  IOSByteArray *javaBytes = [IOSByteArray arrayWithLength:(jint)len];
  int result = [delegate_ readWithByteArray:javaBytes withInt:0 withInt:(int) len];
  if (result == -1) {
    return 0;
  }
  [javaBytes getBytes:(jbyte *)buffer offset:0 length:result];

  if ([self hasBytesAvailable]) {
      streamStatus = prevStatus;
//      [self enqueueEvent:NSStreamEventHasBytesAvailable];
  } else {
      streamStatus = NSStreamStatusAtEnd;
//      [self enqueueEvent:NSStreamEventEndEncountered];
  }

  return result;
}

- (BOOL)getBuffer:(uint8_t **)buffer length:(NSUInteger *)len {
//  NSLog(@"getBuffer");
  return NO;
}

- (BOOL)hasBytesAvailable {
//  NSLog(@"hasByyes");
  return [delegate_ available];
}

- (void)dealloc {
//  NSLog(@"dealloc");
  [delegate_ close];
#if ! __has_feature(objc_arc)
  [delegate_ release];
  [super dealloc];
#endif
}

@end
