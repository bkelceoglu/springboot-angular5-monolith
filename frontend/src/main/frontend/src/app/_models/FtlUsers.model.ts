

import { WhatMissing } from './WhatMissing.model';
export class FtlUsers {
  
  id: number;
  username: string;
  password: string;
  email: string;
  missing: WhatMissing[] = []
  
  constructor(){}
}
