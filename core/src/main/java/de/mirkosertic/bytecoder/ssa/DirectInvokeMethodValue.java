/*
 * Copyright 2017 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.bytecoder.ssa;

import java.util.List;

import de.mirkosertic.bytecoder.core.BytecodeMethodSignature;
import de.mirkosertic.bytecoder.core.BytecodeObjectTypeRef;

public class DirectInvokeMethodValue extends Value {

    private final BytecodeObjectTypeRef clazz;
    private final String methodName;
    private final BytecodeMethodSignature methodSignature;
    private final Variable target;
    private final List<Variable> arguments;

    public DirectInvokeMethodValue(BytecodeObjectTypeRef aClazz, String aMethodName,
            BytecodeMethodSignature aMethodSignature, Variable aTarget, List<Variable> aArguments) {
        clazz = aClazz;
        methodName = aMethodName;
        methodSignature = aMethodSignature;
        target = aTarget;
        arguments = aArguments;
    }

    public Variable getTarget() {
        return target;
    }

    public List<Variable> getArguments() {
        return arguments;
    }

    public BytecodeObjectTypeRef getClazz() {
        return clazz;
    }

    public String getMethodName() {
        return methodName;
    }

    public BytecodeMethodSignature getMethodSignature() {
        return methodSignature;
    }
}