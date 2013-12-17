/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jruby.ir.persistence;

import org.jruby.ir.IRScopeType;
import org.jruby.ir.Operation;
import org.jruby.ir.instructions.Instr;
import org.jruby.ir.operands.Operand;
import org.jruby.ir.operands.OperandType;
import org.jruby.parser.StaticScope;

/**
 *
 * @author enebo
 */
public interface IRReaderDecoder {
    public String decodeString();
    public String[] decodeStringArray();
    public Instr decodeInstr();
    public IRScopeType decodeIRScopeType();
    public StaticScope.Type decodeStaticScopeType();
    public Operation decodeOperation();
    public Operand decodeOperand();
    public OperandType decodeOperandType();
    public boolean decodeBoolean();
    public int decodeInt();
    public long decodeLong();
    public double decodeDouble();
    public float decodeFloat();

    public void seek(int headersOffset);
}
