/**
 * This file is part of bagarino.
 *
 * bagarino is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * bagarino is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with bagarino.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.bagarino.repository;

import io.bagarino.datamapper.Bind;
import io.bagarino.datamapper.Query;
import io.bagarino.datamapper.QueryRepository;
import io.bagarino.model.Event;

@QueryRepository
public interface EventRepository {

    @Query("select * from event where id = :eventId")
    Event findById(@Bind("eventId") int eventId);

}