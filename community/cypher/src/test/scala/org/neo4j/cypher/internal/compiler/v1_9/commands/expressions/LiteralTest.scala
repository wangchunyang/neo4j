package org.neo4j.cypher.internal.compiler.v1_9.commands.expressions

import org.scalatest.Assertions
import org.junit.Test
import org.neo4j.cypher.internal.compiler.v1_9.symbols.{SymbolTable, StringType, CollectionType}

/**
 * Copyright (c) 2002-2013 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
class LiteralTest extends Assertions {
  @Test
  def collections_should_be_typed_correctly() {
    val value = Literal(Seq(Seq("Text")))
    val typ = CollectionType(CollectionType(StringType()))

    assert(value.calculateType(SymbolTable()) === typ)
  }
}
